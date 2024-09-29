# Antlr program használata

Bashben maven használatával hajtsd végre:

```bash
mvn clean generate-sources compile
```

Teszt-futtatás:

```bash
mvn exec:java -Dexec.mainClass="com.fightzone.FightZoneDemo" -Dexec.args="teszt.txt"
```

Használati esetek:

1. **Create a Warrior**:  
   Szintaxis: `create NAME with strength INT` 

2. **Make Two Warriors Fight**:  
   Szintaxis: `make NAME and NAME fight`  
   Keywords: `make`, `and`, `fight`

3. **How Strong is a Warrior**:  
   Szintaxis: `how strong is NAME?`  
   Keywords: `how strong is`

   Ez utóbbi nincs implementálva.