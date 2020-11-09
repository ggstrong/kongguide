docker build -t demo:v3 . 

docker save -o demo_v3.tar demo:v3

docker load -i demo_v3.tar