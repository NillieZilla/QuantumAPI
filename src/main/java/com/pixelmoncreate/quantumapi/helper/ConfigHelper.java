package com.pixelmoncreate.quantumapi.helper;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.loading.FMLPaths;

import static org.apache.commons.codec.language.bm.Rule.ALL;

@SuppressWarnings(ALL)
public final class ConfigHelper {
    public static void load(ForgeConfigSpec config, String location) {
        var path = FMLPaths.CONFIGDIR.get().resolve(location);
        var data = CommentedFileConfig.builder(path).sync().autosave().writingMode(WritingMode.REPLACE).build();

        data.load();

        config.setConfig(data);
    }

}