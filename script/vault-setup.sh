docker exec 'demo-vault' vault login myroot
docker exec 'demo-vault' vault secrets enable -version=2 -path='demo-engine' kv
docker exec 'demo-vault' vault kv put 'demo-engine/demo-spring-boot-app/development' creds.username='dummy-user' creds.password='!abcd1234'
docker exec 'demo-vault' vault kv put 'demo-engine/demo-spring-boot-app/production' creds.username='real-user' creds.password='happy-vault'