;; Split a sequence - Easy
;; Write a function which will split a sequence into two parts.
;; tags - seqs:core-functions
;; restricted - split-at
(ns offline-4clojure.p49
  (:use clojure.test))

(def __
  "4clojure1's solution - works, but can be easier by using juxt"
  (fn [n coll]
    [(take n coll) (drop n coll)])

  )

(def __
  "My solution - this returns a 2-arity function whose signature is the same
  as take and drop"
  (juxt take drop)
  )

(defn -main []
  (are [soln] soln
(= (__ 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])
(= (__ 1 [:a :b :c :d]) [[:a] [:b :c :d]])
(= (__ 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])
))
