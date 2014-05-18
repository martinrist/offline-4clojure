;; Count a Sequence - Easy
;; Write a function which returns the total number of elements in a sequence.
;; tags - seqs:core-functions
;; restricted - count
(ns offline-4clojure.p22
  (:use clojure.test))

(def __
  #(reduce (fn [x _] (inc x)) 0 %))

#_(def __
  ; Recursive version
  (fn my-count
    ([coll]
     (my-count coll 0))
    ([coll cnt]
     (if (empty? coll)
       cnt
       (recur (rest coll) (inc cnt))))))

(defn -main []
  (are [soln] soln
(= (__ '(1 2 3 3 1)) 5)
(= (__ "Hello World") 11)
(= (__ [[1 2] [3 4] [5 6]]) 3)
(= (__ '(13)) 1)
(= (__ '(:a :b :c)) 3)))