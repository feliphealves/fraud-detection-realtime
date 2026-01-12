# fraud-detection-realtime

Real-time fraud detection playground: an event-driven backend system that ingests transactions, evaluates risk, and produces decisions with low latency, auditability, and strong observability practices.

> Goal: a runnable, incremental portfolio project that mirrors how fintech teams build and harden transaction pipelines.

---

## What this project demonstrates
- **Production-style delivery**: small commits, reproducible local environment, clear roadmap.
- **Fintech patterns**: transaction ingestion, idempotency/deduplication, audit trail, reconciliation-ready data.
- **Event-driven architecture**: ingestion → risk evaluation → decisioning (Kafka planned in Week 3).
- **Reliability mindset**: health checks, structured configuration per environment, observability-first approach.

---

## High-level architecture
- **ingestion-service** (Spring Boot): receives transactions via HTTP and will publish events to the pipeline.
- **risk-service** (placeholder): evaluates risk rules/models and returns a decision (later milestones).
- **Postgres**: authoritative persistence for transactions, decisions, rules, and audit logs.
- **Redis**: low-latency cache for rate limiting, deduplication keys, and feature reads.

---

## Repository structure
```text
fraud-detection-realtime/
  services/
    ingestion-service/
    risk-service/             # placeholder
  infra/                      # placeholder (Terraform/Helm later)
  docs/                       # placeholder (ADRs/architecture later)
  docker-compose.yml
  README.md
