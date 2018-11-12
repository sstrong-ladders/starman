(defproject org.purefn/starman "1.0.3-SNAPSHOT"
  :description "A Redis implementation of the Bridges protocols."
  :url "https://github.com/PureFnOrg/starman"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.7.1"
  ;;:global-vars {*warn-on-reflection* true}
  :dependencies [[org.clojure/clojure "1.9.0-alpha16"]
                 [com.gfredericks/test.chuck "0.2.7"]
                 [com.stuartsierra/component "0.3.2"]
                 [com.taoensso/timbre "4.8.0"]
                 [com.taoensso/carmine "2.14.0"]
                 [org.clojure/test.check "0.9.0"]
                 [org.purefn/bridges "1.12.0"]
                 [org.purefn/kurosawa.core "2.0.5"]
                 [redis.clients/jedis "2.9.0"]]
  :profiles
  {:dev {:dependencies [[org.clojure/tools.namespace "0.2.11"]]
         :jvm-opts ["-Xmx6g"]
         :source-paths ["dev"]
         :codeina {:sources ["src"]
                   :reader :clojure
                   :target "doc/dist/latest/api"
                   :src-uri "http://github.com/PureFnOrg/starman/blob/master/"
                   :src-uri-prefix "#L"}
         :plugins [[funcool/codeina "0.4.0"
                    :exclusions [org.clojure/clojure]]]}})
