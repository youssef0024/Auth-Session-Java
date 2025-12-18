package database;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class SessionRepository {

    private Map<UUID, String> tableSessions = new HashMap<>();

    public void create(UUID token, String nom) { tableSessions.put(token, nom); }

    public String readByToken(UUID token) { return tableSessions.get(token); }

    public void deleteByToken(UUID token) { tableSessions.remove(token); }
}
