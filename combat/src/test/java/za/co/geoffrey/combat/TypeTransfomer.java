package za.co.geoffrey.combat;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;

import java.util.Locale;
import java.util.Map;

public class TypeTransfomer implements TypeRegistryConfigurer {
    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }

    @Override
    public void configureTypeRegistry(final TypeRegistry typeRegistry) {
        typeRegistry.defineDataTableType(new DataTableType(Player.class,
                (Map<String, String> row) -> Player
                .builder()
                .attack(Integer.parseInt(row.get("attack")))
                .defense(Integer.parseInt(row.get("defense")))
                .name(row.get("name"))
                .hitPoints(Integer.parseInt(row.get("hitPoints")))
                .build()));

        typeRegistry.defineDataTableType(new DataTableType(Monster.class,
                (Map<String, String> row) -> Monster
                        .builder()
                        .attack(Integer.parseInt(row.get("attack")))
                        .defense(Integer.parseInt(row.get("defense")))
                        .name(row.get("name"))
                        .hitPoints(Integer.parseInt(row.get("hitPoints")))
                        .build()));

    }
}

