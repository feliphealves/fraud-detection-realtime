# fraud-detection-realtime

Real-time fraud detection playground: an event-driven backend system that ingests transactions, evaluates risk, and produces decisions with low latency and strong observability.

## High-level architecture
- **ingestion-service (Spring Boot):** receives transactions via HTTP and publishes events (Kafka in Week 3).
- **risk-service (placeholder):** evaluates risk rules/models and returns a decision.
- **Postgres:** persistence for transactions, rules, and audit trail.
- **Redis:** low-latency cache for features, rate limits, and deduplication.

## Running locally
### 1) Start dependencies
```bash
docker compose up -d
