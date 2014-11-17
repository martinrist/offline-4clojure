;; Get the Caps - Easy
;; Write a function which takes a string and returns a new string containing only the capital letters.
;; tags - strings
;; restricted - 
(ns offline-4clojure.p29
  (:use clojure.test))

(def __
  "4clojure1's solution - using re-seq"
  #(apply str (re-seq #"[A-Z]" %))
  )

(def __
  "My solution - filtering using Character.isUpperCase()"
  (fn [s]
    (apply str (filter #(Character/isUpperCase %) s)))
)

(defn -main []
  (are [soln] soln
(= (__ "HeLlO, WoRlD!") "HLOWRD")
(empty? (__ "nothing"))
(= (__ "$#A(*&987Zf") "AZ")
))
