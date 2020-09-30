docker build -t parkasharjan/product-service:0.0.1-SNAPSHOT .
docker run -d -p 9090:8080 parkasharjan/product-service:0.0.1-SNAPSHOT
docker login
docker push parkasharjan/product-service:0.0.1-SNAPSHOT