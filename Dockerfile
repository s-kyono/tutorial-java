FROM amazoncorretto:21-alpine-jdk

# add repositores update && upgrade
RUN apk update && \
  apk upgrade

# add apk pacakages
RUN apk add --no-cache vim  curl bash ca-certificates openssl ncurses coreutils python3 make gcc g++ libgcc linux-headers grep util-linux binutils findutils

# touch
RUN  touch ~/.bashrc

# nvm install
RUN curl -o- https://raw.githubusercontent.com/creationix/nvm/v0.40.1/install.sh | bash

# コンテナ永続化
ENTRYPOINT ["tail", "-F", "/dev/null"]
