package io.advantageous.czarmaker.consul;

import io.advantageous.czarmaker.Endpoint;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

public interface LeadershipProvider {

    boolean electLeader(final String sessionId, Endpoint endpoint);

    Optional<Endpoint> getLeader(final AtomicLong index);

    Optional<Endpoint> getLeaderLongPoll(final AtomicLong index);

    String createSession();

    boolean renewSession(String sessionId, final AtomicLong index);
}
