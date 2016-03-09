(defproject ring/ring-defaults "0.1.5"
  :description "Ring middleware that provides sensible defaults"
  :url "https://github.com/ring-clojure/ring-defaults"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring/ring-core "1.4.0"]
                 [ring/ring-ssl "0.2.1"]
                 [ring/ring-headers "0.2.0"]
                 [ring/ring-anti-forgery "1.0.0"]
                 [javax.servlet/servlet-api "2.5"]]
  :profiles
  {:dev {:dependencies [[ring/ring-mock "0.3.0"]]}
   :1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}})
