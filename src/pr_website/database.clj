(ns pr-website.database
  (:require [korma.db :as korma]))

(def db-connection-info
  (korma/mysql
    {:classname   "com.mysql.jdbc.Driver"
     :subprotocol "mysql"
     :user        "root"
     :password    "password"
     :subname     "//localhost:3306/pr-website-db"}))

(korma/defdb db db-connection-info)
