
###1. config-server

설정정보는 물리경로파일 및 git url정보 기반으로 사용가능
bootstrap.yml안의 uri를 실제 git url 혹은 로컬경로파일로 지정
프로퍼티 값의 암복호화는 자체 암호화 및 커스텀암호화 둘다 적용가능
커스텀암호화를 사용하는 경우 @Priority 지정을 하지 않으면 TextEncryptor가 중복으로 인지되어 오류 발생

###2. config-client

WAS 재기동 없이 프로퍼티 값들 재기동 처리 
아래주소로 POST로 config-server변경사항이 적용 
curl http://localhost:8080/actuator/refresh -d {} -H "Content-Type: application/json"
