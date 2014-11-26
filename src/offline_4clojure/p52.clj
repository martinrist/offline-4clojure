;; Intro to Destructuring - Easy
;; Let bindings and function parameter lists support destructuring.
;; tags - destructuring
;; restricted - 
(ns offline-4clojure.p52
  (:use clojure.test))

(def __
  "My solution.  This isn't going to compile, but it's the right answer."
  [c e]
)

(defn -main []
  (are [soln] soln
(= [2 4] (let [[a b c d e f g] (range)] __))
))
