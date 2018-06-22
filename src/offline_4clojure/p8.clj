;; Intro to Sets - Elementary
;; Sets are collections of unique values.
;; tags - 
;; restricted - 
(ns offline-4clojure.p8
  (:require clojure.set)
  (:use clojure.test))

(def __
  #{:a :b :c :d}
)

(defn -main []
  (are [soln] soln
(= __ (set '(:a :a :b :c :c :c :c :d :d)))
(= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))
))
