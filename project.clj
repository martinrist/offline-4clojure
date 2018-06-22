(defproject offline-4clojure "0.1.0-SNAPSHOT"
  :description "I want to use my real editor to solve 4clojure problems"
  :url ""
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [clj-http "3.9.0"]
                 [cheshire "5.8.0"]]
  :main  offline-4clojure.core
  :plugins [[lein-ancient "0.6.15"]]
  )
