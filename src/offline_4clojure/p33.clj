;; Replicate a Sequence - Easy
;; Write a function which replicates each element of a sequence a variable number of times.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p33
  (:use clojure.test))

(def __
  "This attempt fails for n = 1 with an ArityException, so it's no good."
  (fn [coll n]
    (apply interleave (repeat n coll))))

(def __
  "4clojure1's solution - apply concat map better as mapcat."
  (fn [coll n]
    (apply concat (map #(repeat n %) coll))))

(def __
  "My solution."
  (fn [coll n]
    (mapcat #(repeat n %) coll)))


(defn -main []
  (are [soln] soln
(= (__ [1 2 3] 2) '(1 1 2 2 3 3))
(= (__ [:a :b] 4) '(:a :a :a :a :b :b :b :b))
(= (__ [4 5 6] 1) '(4 5 6))
(= (__ [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))
(= (__ [44 33] 2) [44 44 33 33])
))
