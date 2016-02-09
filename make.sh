#!/bin/bash
javac -target 1.4 -source 1.4 xandaros/weechat/Weechat.java || exit 1
jar cvmf weechat.manifest Weechat.jar .
cd ..
./sign.sh Weechat/Weechat.jar
cd Weechat
rm Weechat.azw2
cp Weechat.jar Weechat.azw2
rm /home/xandaros/kindle/mnt/us/documents/Weechat.azw2
cp Weechat.azw2 /home/xandaros/kindle/mnt/us/documents/Weechat.azw2
