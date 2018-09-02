package org.junit;

public interface AssertionCallback {
  void handle(AssertionError error);
}
