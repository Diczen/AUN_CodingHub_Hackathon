from fastapi import FastAPI, HTTPException
from routes.route import router


app = FastAPI() # initialize app

app.include_router(router)
