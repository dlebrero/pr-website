(ns pr-website.handler
  (:require [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]
            [ring.middleware.json :as json]
            [ring.util.response :refer [response]]
            [pr-website.query :refer :all]))

(defroutes app-routes
           (GET "/api/experiencias" []
                (response (get-experiencias)))
           (POST "/api/experiencias" {:keys [params]}
             (let [{:keys [dataInicio dataFim empresa titulo principaisAtividades]} params]
               (response (add-experiencia dataInicio dataFim empresa titulo principaisAtividades))))
           (route/resources "/")
           (route/not-found "Not found"))

(def app
  (-> (handler/api app-routes)
      (json/wrap-json-params)
      (json/wrap-json-response)))
