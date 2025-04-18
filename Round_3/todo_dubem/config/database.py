from pymongo import MongoClient

uri = "mongodb+srv://dubi:AQj6vBgOwygi4f3F@cluster0.zjnpth7.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0"
client = MongoClient(uri) # Connection string for MongoDB

db = client.todo_db

collection_name = db["todo_collection"]
