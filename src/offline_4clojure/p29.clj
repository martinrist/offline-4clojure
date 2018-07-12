;; Get the Caps - Easy
;; Write a function which takes a string and returns a new string containing only the capital letters.
;; tags - strings
;; restricted - 
(ns offline-4clojure.p29
  (:use clojure.test))

(def __
  (comp (partial apply str) (partial re-seq #"[A-Z]"))
)

(defn -main []
  (are [soln] soln
(= (__ "HeLlO, WoRlD!") "HLOWRD")
(empty? (__ "nothing"))
(= (__ "$#A(*&987Zf") "AZ")
))
