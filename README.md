
mvn clean verify -P sonar -Dsonar.host.url=https://sonarcloud.io -Dsonar.organization=reenasadhukhan -Dsonar.login=1aa2f4a315f3916e689308a02e34f0f31800a62e

mvn clean verify -P sonar -Dsonar.host.url=https://sonarcloud.io -Dsonar.organization=reenasadhukhan -Dsonar.login=1aa2f4a315f3916e689308a02e34f0f31800a62e -Dsonar.sources=src/test -Dsonar.test.inclusions=src/test/java/*

