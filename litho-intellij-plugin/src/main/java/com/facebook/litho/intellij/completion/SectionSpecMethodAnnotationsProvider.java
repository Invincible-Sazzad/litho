/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.facebook.litho.intellij.completion;

import com.facebook.litho.intellij.LithoPluginUtils;
import com.facebook.litho.sections.annotations.OnCreateChildren;
import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.util.ProcessingContext;
import java.util.HashSet;
import java.util.Set;

public class SectionSpecMethodAnnotationsProvider extends CompletionProvider<CompletionParameters> {
  static final CompletionProvider<CompletionParameters> INSTANCE =
      new SectionSpecMethodAnnotationsProvider();

  static final Set<String> ANNOTATION_QUALIFIED_NAMES = new HashSet<>();

  static {
    ANNOTATION_QUALIFIED_NAMES.add(OnCreateChildren.class.getTypeName());
  }

  @Override
  protected void addCompletions(
      CompletionParameters parameters, ProcessingContext context, CompletionResultSet result) {
    MethodCompletionContributor.addMethodCompletions(
        parameters.getPosition(),
        LithoPluginUtils::hasLithoSectionSpecAnnotation,
        ANNOTATION_QUALIFIED_NAMES,
        result);
  }
}
