package com.durga.multithreading;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * @created 13/05/2025 - 05:31
 * @author DurgaNaresh
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class VirtualThreadHttpServer {
  public static void main(String[] args) {
    new VirtualThreadHttpServer().start();
  }

  private void start() {
    int port = 8080;

    try {
      // Create a server socket on port 8080
      ServerSocket serverSocket = new ServerSocket(port);
      System.out.println("Server listening on port " + port);
      boolean first = true;

      while (true) {
        // Accept incoming client connections
        Socket clientSocket = serverSocket.accept();
        if (first) {
          clientSocket.close();
          first = false;
          continue;
        } else {
          first = true;
        }


        System.out.println("Accepted connection from " + clientSocket.getInetAddress());

        // Handle the client request
        Thread.startVirtualThread(new SimpleWorker(clientSocket));

      }
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }
}
