;; Interleave Two Seqs - Easy
;; Write a function which takes two sequences and returns the first item from each, then the second item from each, then the third, etc.
;; tags - seqs:core-functions
;; restricted - interleave
(ns offline-4clojure.p39
  (:use clojure.test))

(def __
  "My initial solution."
  (fn [coll1 coll2]
    (mapcat #(vector %1 %2) coll1 coll2))
)

(def __
  "Slightly tidier - we don't need the explicit function literal..."
  (partial mapcat #(vector %1 %2)))

(def __
  "... nor do we need %1 and %2"
  (partial mapcat vector))

(defn -main []
  (are [soln] soln
(= (__ [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))
(= (__ [1 2] [3 4 5 6]) '(1 3 2 4))
(= (__ [1 2 3 4] [5]) [1 5])
(= (__ [30 20] [25 15]) [30 25 20 15])
))
