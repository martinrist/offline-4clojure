;; Hello World - Elementary
;; Write a function which returns a personalized greeting.
;; tags - 
;; restricted - 
(ns offline-4clojure.p16
  (:use clojure.test))

(def __
  #(str "Hello, " % "!")
;; your solution here
)

(defn -main []
  (are [soln] soln
(= (__ "Dave") "Hello, Dave!")
(= (__ "Jenn") "Hello, Jenn!")
(= (__ "Rhea") "Hello, Rhea!")
))
