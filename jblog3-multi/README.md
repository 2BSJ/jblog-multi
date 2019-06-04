# WEB.XML + JAVA CONFIG Ver 수정
✂오류수정
---
* xml에서 config버전으로 옮길때 securityconfig Import 조심 (이유없이 catalina로 임포트 될때 있는데 오류도 안뜸)
* 경로를 인터셉터로 못찾아갈시 컨트롤러에 RequestMapping 경로를 설정해주고 빈 메서드 만들어주면 찾아가진다함 (난 정상됨)
