;; Flatten a Sequence - Easy
;; Write a function which flattens a sequence.
;; tags - seqs:core-functions
;; restricted - flatten
(ns offline-4clojure.p28
  (:use clojure.test))

; My solution
(def __
  (fn flattify [coll]
    (mapcat (fn [member]
              (if (coll? member)
                (if (every? (complement coll?) member)
                  member
                  (flattify member))
                (vector member))) coll))
)


; 4clojure1's solution, using tree-seq
; Note use of sequential? rather than seq otherwise we lose the vectors.
(def __
  (fn my-flatten [x]
    (filter (complement sequential?)
            (rest (tree-seq sequential? seq x))))
  )

(defn -main []
  (are [soln] soln
(= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
(= (__ ["a" ["b"] "c"]) '("a" "b" "c"))
(= (__ '((((:a))))) '(:a))
))
