(defproject pr-website "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [compojure "1.6.1"]
                 [ring/ring-core "1.7.1"]
                 [ring/ring-json "0.4.0"]
                 [korma "0.4.3"]
                 [mysql/mysql-connector-java "5.1.6"]
                 [ring/ring-defaults "0.2.1"]]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler pr-website.handler/app}
  :profiles {:dev     {:dependencies [[javax.servlet/servlet-api "2.5"]
                                      [ring/ring-mock "0.3.2"]]}
             :uberjar {:aot :all}})
