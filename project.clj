(defproject metabase-migrator "0.1.0-SNAPSHOT"
  :description "Migrate Questions and Dashboard across Metabase Data Sources"
  :url "http://www.openchs.org/"
  :license {:name "AGPLv3"
            :url  "https://www.gnu.org/licenses/agpl-3.0.en.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clj-http "3.7.0"]
                 [cheshire "5.8.0"]
                 [print-foo "1.0.1"]
                 [environ "1.1.0"]]
  :main ^:skip-aot metabase-migrator.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
