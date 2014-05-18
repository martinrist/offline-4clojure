;; Intro to Lists - Elementary
;; Lists can be constructed with either a function or a quoted form.
;; tags - 
;; restricted - 
(ns offline-4clojure.p4
  (:use clojure.test))

(def _1
  :a)

(def _2
  :b)

(def _3
  :c)

(defn -main []
  (are [soln] soln
(= (list _1 _2 _3) '(:a :b :c))))
