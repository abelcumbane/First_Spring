#!/bin/bash

# Caminho do seu repositório (Altere para o caminho real)
REPO_PATH="/e/Spring_Projects/First_Spring"

# Mensagem de commit aleatória
MESSAGES=("Refactoring code" "Bug fix" "Updating dependencies" "Small UI improvements" "Adding logs")
MESSAGE=${MESSAGES[$RANDOM % ${#MESSAGES[@]}]}

# Gerar log de execução
echo "$(date) - Iniciando commit automático" >> commits_log.txt

cd "$REPO_PATH" || exit

# Garante que há mudanças para commit (gera um arquivo de log com a data)
echo "$(date) - Gerando arquivo de log de commit" > commits_log.txt

# Adiciona, commita e faz push
git add .
git commit -m "$MESSAGE" >> /e/Spring_Projects/First_Spring/commits_log.txt 2>&1
git push origin main >> /e/Spring_Projects/First_Spring/commits_log.txt 2>&1

echo "$(date) - Commit e push completos" >> /e/Spring_Projects/First_Spring/commits_log.txt

