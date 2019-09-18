#!/bin/bash

git pull
git add .
git commit -m "$1 $2 $3"
git push