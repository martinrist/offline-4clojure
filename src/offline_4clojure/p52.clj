;; Intro to Destructuring - Elementary
;; Let bindings and function parameter lists support destructuring.
;; tags - destructuring
;; restricted - 
(ns offline-4clojure.p52
  (:use clojure.test))

(def __
  (comment "Won't compile but works for 4Clojure"
           [c e])
  )

(defn -main []
  (are [soln] soln
(= [2 4] (let [[a b c d e] [0 1 2 3 4]] __))
))
