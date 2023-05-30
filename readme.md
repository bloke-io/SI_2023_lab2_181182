Vlado Dimovski 181182

## 2. CFG 

![CFG](https://i.imgur.com/FwYH9LG.png)

## 3. Цикломатска комплексност

Ја добив со помош на формулата, тука P = 2 бидејќи има само 2 можни патеви по кои може да тргне низ Control Flow Graph-ot


## 4. Every Branch критериумот

#### 4.1 First test case is that we enter null for the fields and it goes through the left execution path
#### 4.2 Sceond test case is that we enter the fields and it goes through the second execution path

## 5. Multiple Condition критериумот

```json
Case1: user = null, password = null, email == null
Case2: user = null, password = 1, email = a,
Case3: user = a, password = null, email = a,
Case4: user = a, password = 1, email = null
```

So ova gi opfakjame site mozni varijacii na input so koj checkot vrakja true/false

## 6. Test Cases објаснување

Креираме `User` со параметрите од погорните тест случаи и потоа ја повикуваме методата и правиме assert на тоа што сме го добиле.