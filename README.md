# Simple HTTP Server in Java
 
A minimal HTTP server built from scratch using Java's `ServerSocket` and `Socket` classes — no external libraries needed.
 
## Getting Started
 
**Compile and run:**
```bash
javac SimpleHTTPServer.java
java SimpleHTTPServer
```
 
Then open your browser and go to `http://localhost:8080`. You'll see today's date returned as a response.
 
## How It Works
 
The server binds to port `8080`, waits for a browser to connect, reads the incoming HTTP request, and writes back a `200 OK` response with today's date. It then closes the connection and loops back to wait for the next client.
 
## Limitations
 
- Handles one client at a time (single-threaded)
- Always returns the same response regardless of the request
- No HTTPS support
## Reference
 
Based on this [Javarevisited tutorial](https://javarevisited.blogspot.com/2015/06/how-to-create-http-server-in-java-serversocket-example.html).
 
