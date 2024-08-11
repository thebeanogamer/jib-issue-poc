#!/bin/bash

podman rm -vf registry || true
podman run -d -p 5000:5000 --name registry docker.io/library/registry:2.8.3@sha256:12120425f07de11a1b899e418d4b0ea174c8d4d572d45bdb640f93bc7ca06a3d