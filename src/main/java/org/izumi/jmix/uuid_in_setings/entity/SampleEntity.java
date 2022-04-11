package org.izumi.jmix.uuid_in_setings.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.util.UUID;

import io.jmix.appsettings.defaults.AppSettingsDefault;
import io.jmix.appsettings.defaults.AppSettingsDefaultInt;
import io.jmix.appsettings.entity.AppSettingsEntity;
import io.jmix.core.metamodel.annotation.JmixEntity;

@JmixEntity
@Table(name = "SAMPLE_ENTITY")
@Entity
public class SampleEntity extends AppSettingsEntity {

    @AppSettingsDefault("5e3ebc64-f73f-4d31-a978-602e97c39cc5")
    @Column(name = "SOME_SETTING_1")
    private UUID someSetting1;

    @AppSettingsDefault("some_settings_2")
    @Column(name = "SOME_SETTING_2")
    private String someSettings2;

    @AppSettingsDefaultInt(15)
    @Column(name = "SOME_SETTING_3")
    private Integer someSetting3;

    public UUID getSomeSetting1() {
        return someSetting1;
    }

    public void setSomeSetting1(UUID someSetting1) {
        this.someSetting1 = someSetting1;
    }

    public String getSomeSettings2() {
        return someSettings2;
    }

    public void setSomeSettings2(String someSettings2) {
        this.someSettings2 = someSettings2;
    }

    public Integer getSomeSetting3() {
        return someSetting3;
    }

    public void setSomeSetting3(Integer someSetting3) {
        this.someSetting3 = someSetting3;
    }
}
