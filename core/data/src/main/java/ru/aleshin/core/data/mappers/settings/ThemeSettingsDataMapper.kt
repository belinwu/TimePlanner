/*
 * Copyright 2023 Stanislav Aleshin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ru.aleshin.core.data.mappers.settings

import ru.aleshin.core.data.models.settings.ThemeSettingsEntity
import ru.aleshin.core.domain.entities.settings.ThemeSettings

/**
 * @author Stanislav Aleshin on 06.10.2023.
 */
fun ThemeSettingsEntity.mapToDomain() = ThemeSettings(
    language = language,
    themeColors = themeColors,
    colorsType = colorsType,
    isDynamicColorEnable = isDynamicColorEnable,
)

fun ThemeSettings.mapToData() = ThemeSettingsEntity(
    id = 0,
    language = language,
    themeColors = themeColors,
    colorsType = colorsType,
    isDynamicColorEnable = isDynamicColorEnable,
)
