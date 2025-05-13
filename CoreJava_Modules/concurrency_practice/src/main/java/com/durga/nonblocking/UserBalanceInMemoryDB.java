package com.durga.nonblocking;

import java.util.HashMap;
import java.util.Map;

/*
 * @created 13/05/2025 - 05:42
 * @author DurgaNaresh
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
public class UserBalanceInMemoryDB {
  private final static UserBalanceInMemoryDB INSTANCE = new UserBalanceInMemoryDB();
  private final Map<String, UserRecord> usersRecords = new HashMap<>();

  UserBalanceInMemoryDB() {
    usersRecords.put("user1", new UserRecord());
  }
  public static UserBalanceInMemoryDB getInstance() {
    return INSTANCE;
  }

  public void updateUserBalance(String userId, int amount) {
    usersRecords.get(userId).updateBalance(amount);
  }

  public int getUserBalance(String userId) {
    return usersRecords.get(userId).getBalance();
  }
}
