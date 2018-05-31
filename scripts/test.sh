while true
do
URL=`cat /dev/urandom | tr -dc 'a-zA-Z0-9' | fold -w 32 | head -n 1`
echo $URL
curl -v 10.33.144.121/demo-1.0-SNAPSHOT/$URL -o /dev/null 2>&1 | grep MISS
if [ $? -ne 0 ]; then
  exit 1
fi
curl -v 10.33.144.121/demo-1.0-SNAPSHOT/$URL -o /dev/null 2>&1 | grep HIT
if [ $? -ne 0 ]; then
  exit 1
fi
sleep 1
done
