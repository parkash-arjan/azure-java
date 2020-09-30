docker build -t parkasharjan/purchase-service:0.0.1-SNAPSHOT .
docker run -d -p 9091:8080 parkasharjan/purchase-service:0.0.1-SNAPSHOT
docker login
docker push parkasharjan/purchase-service:0.0.1-SNAPSHOT