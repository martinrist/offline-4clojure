;; Reverse a Sequence - Easy
;; Write a function which reverses a sequence.
;; tags - seqs:core-functions
;; restricted - reverse:rseq
(ns offline-4clojure.p23
  (:use clojure.test))

(def __
  (fn [coll]
    (reduce conj '() coll)))

#_(def __
  ; Recursive implementation
  (fn rec-reverse
    ([coll reversed]
     (if (empty? coll)
       reversed
       (recur (drop-last coll) (conj reversed (last coll)))))
    ([coll]
     (rec-reverse coll []))))

(defn -main []
  (are [soln] soln
(= (__ [1 2 3 4 5]) [5 4 3 2 1])
(= (__ (sorted-set 5 7 2 7)) '(7 5 2))
(= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])))
