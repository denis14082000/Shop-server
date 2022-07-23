CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

ALTER TABLE "product"
    ADD COLUMN "public_id" UUID DEFAULT uuid_generate_v4(),
    ADD COLUMN "description" TEXT;