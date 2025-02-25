package com.facebook.litho.sections.processor.integration.resources;

import android.widget.TextView;
import androidx.annotation.AttrRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.VisibleForTesting;
import com.facebook.litho.ClickEvent;
import com.facebook.litho.CommonUtils;
import com.facebook.litho.Component;
import com.facebook.litho.Diff;
import com.facebook.litho.EventDispatcher;
import com.facebook.litho.EventHandler;
import com.facebook.litho.HasEventDispatcher;
import com.facebook.litho.StateContainer;
import com.facebook.litho.StateValue;
import com.facebook.litho.TreeProps;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Generated;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.annotations.PropSetter;
import com.facebook.litho.annotations.RequiredProp;
import com.facebook.litho.annotations.ResType;
import com.facebook.litho.annotations.State;
import com.facebook.litho.annotations.TreeProp;
import com.facebook.litho.sections.ChangesInfo;
import com.facebook.litho.sections.Children;
import com.facebook.litho.sections.LoadingEvent;
import com.facebook.litho.sections.Section;
import com.facebook.litho.sections.SectionContext;
import java.util.BitSet;

/**
 * classJavadoc
 *
 * <p>
 *
 * @prop-required prop1 int
 * @prop-optional prop2 java.lang.String
 * @prop-required prop3 com.facebook.litho.Component
 * @prop-required prop4 java.lang.String
 * @prop-required prop5 com.facebook.litho.sections.Section
 * @see com.facebook.litho.sections.processor.integration.resources.FullGroupSectionSpec
 */
@Generated
final class FullGroupSection<T> extends Section {
  @Prop(resType = ResType.NONE, optional = false)
  @Comparable(type = 3)
  int prop1;

  @Prop(resType = ResType.NONE, optional = true)
  @Comparable(type = 13)
  String prop2;

  @Prop(resType = ResType.NONE, optional = false)
  @Comparable(type = 10)
  Component prop3;

  @Prop(resType = ResType.STRING, optional = false)
  @Comparable(type = 13)
  String prop4;

  @Prop(resType = ResType.NONE, optional = false)
  @Comparable(type = 15)
  Section prop5;

  @TreeProp
  @Comparable(type = 13)
  FullGroupSectionSpec.TreePropWrapper treeProp;

  String _service;

  @Nullable EventHandler<TestEvent> testEventHandler;

  private FullGroupSection() {
    super("FullGroupSection");
  }

  private FullGroupSectionStateContainer getStateContainerImpl(SectionContext c) {
    return (FullGroupSectionStateContainer) Section.getStateContainer(c, this);
  }

  @Override
  protected FullGroupSectionStateContainer createStateContainer() {
    return new FullGroupSectionStateContainer();
  }

  @Override
  public boolean isEquivalentTo(Section other) {
    if (this == other) {
      return true;
    }
    if (other == null || getClass() != other.getClass()) {
      return false;
    }
    FullGroupSection fullGroupSectionRef = (FullGroupSection) other;
    if (prop1 != fullGroupSectionRef.prop1) {
      return false;
    }
    if (prop2 != null
        ? !prop2.equals(fullGroupSectionRef.prop2)
        : fullGroupSectionRef.prop2 != null) {
      return false;
    }
    if (prop3 != null
        ? !prop3.isEquivalentTo(fullGroupSectionRef.prop3)
        : fullGroupSectionRef.prop3 != null) {
      return false;
    }
    if (prop4 != null
        ? !prop4.equals(fullGroupSectionRef.prop4)
        : fullGroupSectionRef.prop4 != null) {
      return false;
    }
    if (prop5 != null
        ? !prop5.isEquivalentTo(fullGroupSectionRef.prop5)
        : fullGroupSectionRef.prop5 != null) {
      return false;
    }
    if (!useTreePropsFromContext()) {
      if (treeProp != null
          ? !treeProp.equals(fullGroupSectionRef.treeProp)
          : fullGroupSectionRef.treeProp != null) {
        return false;
      }
    }
    return true;
  }

  @Override
  public FullGroupSection makeShallowCopy(boolean deepCopy) {
    FullGroupSection component = (FullGroupSection) super.makeShallowCopy(deepCopy);
    component.prop3 = component.prop3 != null ? component.prop3.makeShallowCopy() : null;
    component.prop5 = component.prop5 != null ? component.prop5.makeShallowCopy() : null;
    if (!deepCopy) {
      component.setStateContainer(new FullGroupSectionStateContainer());
    }
    return component;
  }

  public static <T> Builder<T> create(SectionContext context) {
    final Builder builder = new Builder();
    FullGroupSection instance = new FullGroupSection();
    builder.init(context, instance);
    return builder;
  }

  @Override
  protected void transferState(
      StateContainer _prevStateContainer, StateContainer _nextStateContainer) {
    FullGroupSectionStateContainer<T> prevStateContainer =
        (FullGroupSectionStateContainer<T>) _prevStateContainer;
    FullGroupSectionStateContainer<T> nextStateContainer =
        (FullGroupSectionStateContainer<T>) _nextStateContainer;
    nextStateContainer.state1 = prevStateContainer.state1;
    nextStateContainer.state2 = prevStateContainer.state2;
  }

  private FullGroupSectionStateContainer getStateContainerWithLazyStateUpdatesApplied(
      SectionContext c, FullGroupSection component) {
    FullGroupSectionStateContainer _stateContainer = new FullGroupSectionStateContainer();
    transferState(Section.getStateContainer(c, component), _stateContainer);
    c.applyLazyStateUpdatesForContainer(_stateContainer);
    return _stateContainer;
  }

  protected static void updateState(SectionContext c, Object param) {
    Section _component = c.getSectionScope();
    if (_component == null) {
      return;
    }
    StateContainer.StateUpdate _stateUpdate = new StateContainer.StateUpdate(0, param);
    c.updateStateAsync(_stateUpdate, "updateState:FullGroupSection.updateState");
  }

  protected static void updateStateAsync(SectionContext c, Object param) {
    Section _component = c.getSectionScope();
    if (_component == null) {
      return;
    }
    StateContainer.StateUpdate _stateUpdate = new StateContainer.StateUpdate(0, param);
    c.updateStateAsync(_stateUpdate, "updateState:FullGroupSection.updateState");
  }

  protected static void updateStateSync(SectionContext c, Object param) {
    Section _component = c.getSectionScope();
    if (_component == null) {
      return;
    }
    StateContainer.StateUpdate _stateUpdate = new StateContainer.StateUpdate(0, param);
    c.updateStateSync(_stateUpdate, "updateState:FullGroupSection.updateState");
  }

  protected static void lazyUpdateState2(SectionContext c, final Object lazyUpdateValue) {
    Section _component = c.getSectionScope();
    if (_component == null) {
      return;
    }
    StateContainer.StateUpdate _stateUpdate =
        new StateContainer.StateUpdate(-2147483648, lazyUpdateValue);
    c.updateStateLazy(_stateUpdate);
  }

  @Nullable
  public static EventHandler<TestEvent> getTestEventHandler(SectionContext context) {
    if (context.getSectionScope() == null) {
      return null;
    }
    return ((FullGroupSection) context.getSectionScope()).testEventHandler;
  }

  static void dispatchTestEvent(EventHandler _eventHandler) {
    final TestEvent _eventState = new TestEvent();
    EventDispatcher _dispatcher = _eventHandler.mHasEventDispatcher.getEventDispatcher();
    _dispatcher.dispatchOnEvent(_eventHandler, _eventState);
  }

  private void testEvent(
      HasEventDispatcher _abstract, SectionContext c, TextView view, int someParam) {
    FullGroupSection _ref = (FullGroupSection) _abstract;
    FullGroupSectionStateContainer stateContainer =
        getStateContainerWithLazyStateUpdatesApplied(c, _ref);
    FullGroupSectionSpec.testEvent(
        c, view, someParam, (Object) stateContainer.state2, (String) _ref.prop2);
  }

  public static EventHandler<ClickEvent> testEvent(SectionContext c, int someParam) {
    return newEventHandler(
        FullGroupSection.class,
        "FullGroupSection",
        c,
        -1204074200,
        new Object[] {
          c, someParam,
        });
  }

  @Override
  protected Object dispatchOnEventImpl(final EventHandler eventHandler, final Object eventState) {
    int id = eventHandler.id;
    switch (id) {
      case -1204074200:
        {
          ClickEvent _event = (ClickEvent) eventState;
          testEvent(
              eventHandler.mHasEventDispatcher,
              (SectionContext) eventHandler.params[0],
              (TextView) _event.view,
              (int) eventHandler.params[1]);
          return null;
        }
      default:
        return null;
    }
  }

  @Override
  protected void createInitialState(SectionContext c) {
    StateValue<T> state1 = new StateValue<>();
    StateValue<Object> state2 = new StateValue<>();
    FullGroupSectionSpec.onCreateInitialState(
        (SectionContext) c, (int) prop1, (StateValue<T>) state1, (StateValue<Object>) state2);
    getStateContainerImpl(c).state1 = state1.get();
    getStateContainerImpl(c).state2 = state2.get();
  }

  private String onCreateService(SectionContext c) {
    String _result;
    _result = (String) FullGroupSectionSpec.onCreateService((SectionContext) c, (String) prop2);
    return _result;
  }

  @Override
  public void createService(SectionContext context) {
    _service = onCreateService(context);
  }

  @Override
  protected void transferService(SectionContext c, Section previous, Section next) {
    FullGroupSection previousSection = (FullGroupSection) previous;
    FullGroupSection nextSection = (FullGroupSection) next;
    nextSection._service = previousSection._service;
  }

  @Override
  protected Object getService(Section section) {
    return ((FullGroupSection) section)._service;
  }

  @Override
  protected Children createChildren(SectionContext c) {
    Children _result;
    _result =
        (Children)
            FullGroupSectionSpec.onCreateChildren(
                (SectionContext) c,
                (Component) prop3,
                (String) prop4,
                (Section) prop5,
                (T) getStateContainerImpl(c).state1);
    return _result;
  }

  @Override
  protected void bindService(SectionContext c) {
    FullGroupSectionSpec.bindService(
        (SectionContext) c,
        (String) _service,
        (int) prop1,
        (Object) getStateContainerImpl(c).state2);
  }

  @Override
  protected void unbindService(SectionContext c) {
    FullGroupSectionSpec.unbindService(
        (SectionContext) c,
        (String) _service,
        (int) prop1,
        (Object) getStateContainerImpl(c).state2);
  }

  @Override
  protected void refresh(SectionContext c) {
    FullGroupSectionSpec.onRefresh((SectionContext) c, (String) _service, (String) prop2);
  }

  @Override
  protected void dataBound(SectionContext c) {
    FullGroupSectionSpec.onDataBound(
        (SectionContext) c, (Component) prop3, (Object) getStateContainerImpl(c).state2);
  }

  @Override
  protected boolean shouldUpdate(
      SectionContext _prevScopedContext,
      Section _prevAbstractImpl,
      SectionContext _nextScopedContext,
      Section _nextAbstractImpl) {
    FullGroupSection _prevImpl = (FullGroupSection) _prevAbstractImpl;
    FullGroupSection _nextImpl = (FullGroupSection) _nextAbstractImpl;
    boolean _result;
    Diff<Integer> prop1 =
        new Diff<Integer>(
            _prevImpl == null ? null : _prevImpl.prop1, _nextImpl == null ? null : _nextImpl.prop1);
    _result = (boolean) FullGroupSectionSpec.shouldUpdate((Diff<Integer>) prop1);
    return _result;
  }

  @Override
  protected void viewportChanged(
      SectionContext c,
      int firstVisibleIndex,
      int lastVisibleIndex,
      int totalCount,
      int firstFullyVisibleIndex,
      int lastFullyVisibleIndex) {
    FullGroupSectionSpec.onViewportChanged(
        (SectionContext) c,
        (int) firstVisibleIndex,
        (int) lastVisibleIndex,
        (int) totalCount,
        (int) firstFullyVisibleIndex,
        (int) lastFullyVisibleIndex,
        (T) getStateContainerImpl(c).state1,
        (Object) getStateContainerImpl(c).state2,
        (int) prop1,
        (String) prop2,
        (Component) prop3);
  }

  @Override
  protected void dataRendered(
      SectionContext c,
      boolean isDataChanged,
      boolean isMounted,
      long uptimeMillis,
      int firstVisibleIndex,
      int lastVisibleIndex,
      ChangesInfo changesInfo,
      int globalOffset) {
    FullGroupSectionSpec.onDataRendered(
        (SectionContext) c,
        (boolean) isDataChanged,
        (boolean) isMounted,
        (long) uptimeMillis,
        (int) firstVisibleIndex,
        (int) lastVisibleIndex,
        (ChangesInfo) changesInfo,
        (int) globalOffset,
        (int) prop1,
        (Object) getStateContainerImpl(c).state2,
        (int) getCached(c));
  }

  @Override
  protected void populateTreeProps(TreeProps treeProps) {
    if (treeProps == null) {
      return;
    }
    treeProp =
        treeProps.get(
            com.facebook.litho.sections.processor.integration.resources.FullGroupSectionSpec
                .TreePropWrapper.class);
  }

  @Override
  protected TreeProps getTreePropsForChildren(SectionContext c, TreeProps parentTreeProps) {
    final TreeProps childTreeProps = TreeProps.acquire(parentTreeProps);
    childTreeProps.put(
        com.facebook.litho.sections.processor.integration.resources.FullGroupSectionSpec
            .TreePropWrapper.class,
        FullGroupSectionSpec.onCreateTreeProp(
            (SectionContext) c,
            useTreePropsFromContext()
                ? ((FullGroupSectionSpec.TreePropWrapper)
                    Component.getTreePropFromParent(
                        parentTreeProps,
                        com.facebook.litho.sections.processor.integration.resources
                            .FullGroupSectionSpec.TreePropWrapper.class))
                : treeProp));
    return childTreeProps;
  }

  private int getCached(SectionContext c) {
    String globalKey = c.getGlobalKey();
    final CachedInputs inputs = new CachedInputs(globalKey, prop1);
    Integer cached = (Integer) c.getCachedValue(inputs);
    if (cached == null) {
      cached = FullGroupSectionSpec.onCalculateCached(prop1);
      c.putCachedValue(inputs, cached);
    }
    return cached;
  }

  @VisibleForTesting(otherwise = 2)
  @Generated
  static class FullGroupSectionStateContainer<T> extends StateContainer {
    @State
    @Comparable(type = 13)
    T state1;

    @State
    @Comparable(type = 13)
    Object state2;

    @Override
    public void applyStateUpdate(StateContainer.StateUpdate stateUpdate) {
      StateValue<T> state1;
      StateValue<Object> state2;

      final Object[] params = stateUpdate.params;
      switch (stateUpdate.type) {
        case 0:
          state2 = new StateValue<Object>();
          state2.set(this.state2);
          FullGroupSectionSpec.updateState(state2, params[0]);
          this.state2 = state2.get();
          break;

        case -2147483648:
          this.state2 = (Object) params[0];
          break;
      }
    }
  }

  @Generated
  public static final class Builder<T> extends Section.Builder<Builder<T>> {
    FullGroupSection mFullGroupSection;

    SectionContext mContext;

    private final String[] REQUIRED_PROPS_NAMES = new String[] {"prop1", "prop3", "prop4", "prop5"};

    private final int REQUIRED_PROPS_COUNT = 4;

    private final BitSet mRequired = new BitSet(REQUIRED_PROPS_COUNT);

    private void init(SectionContext context, FullGroupSection fullGroupSectionRef) {
      super.init(context, fullGroupSectionRef);
      mFullGroupSection = fullGroupSectionRef;
      mContext = context;
      mRequired.clear();
    }

    @PropSetter(value = "prop1", required = true)
    @RequiredProp("prop1")
    public Builder<T> prop1(int prop1) {
      this.mFullGroupSection.prop1 = prop1;
      mRequired.set(0);
      return this;
    }

    @PropSetter(value = "prop2", required = false)
    public Builder<T> prop2(String prop2) {
      this.mFullGroupSection.prop2 = prop2;
      return this;
    }

    @PropSetter(value = "prop3", required = true)
    @RequiredProp("prop3")
    public Builder<T> prop3(Component prop3) {
      this.mFullGroupSection.prop3 = prop3 == null ? null : prop3.makeShallowCopy();
      mRequired.set(1);
      return this;
    }

    @PropSetter(value = "prop3", required = true)
    @RequiredProp("prop3")
    public Builder<T> prop3(Component.Builder<?> prop3Builder) {
      this.mFullGroupSection.prop3 = prop3Builder == null ? null : prop3Builder.build();
      mRequired.set(1);
      return this;
    }

    @PropSetter(value = "prop4", required = true)
    @RequiredProp("prop4")
    public Builder<T> prop4(String prop4) {
      this.mFullGroupSection.prop4 = prop4;
      mRequired.set(2);
      return this;
    }

    @PropSetter(value = "prop4", required = true)
    @RequiredProp("prop4")
    public Builder<T> prop4Res(@StringRes int resId) {
      this.mFullGroupSection.prop4 = mResourceResolver.resolveStringRes(resId);
      mRequired.set(2);
      return this;
    }

    @PropSetter(value = "prop4", required = true)
    @RequiredProp("prop4")
    public Builder<T> prop4Res(@StringRes int resId, Object... formatArgs) {
      this.mFullGroupSection.prop4 = mResourceResolver.resolveStringRes(resId, formatArgs);
      mRequired.set(2);
      return this;
    }

    @PropSetter(value = "prop4", required = true)
    @RequiredProp("prop4")
    public Builder<T> prop4Attr(@AttrRes int attrResId, @StringRes int defResId) {
      this.mFullGroupSection.prop4 = mResourceResolver.resolveStringAttr(attrResId, defResId);
      mRequired.set(2);
      return this;
    }

    @PropSetter(value = "prop4", required = true)
    @RequiredProp("prop4")
    public Builder<T> prop4Attr(@AttrRes int attrResId) {
      this.mFullGroupSection.prop4 = mResourceResolver.resolveStringAttr(attrResId, 0);
      mRequired.set(2);
      return this;
    }

    @PropSetter(value = "prop5", required = true)
    @RequiredProp("prop5")
    public Builder<T> prop5(Section prop5) {
      this.mFullGroupSection.prop5 = prop5;
      mRequired.set(3);
      return this;
    }

    @PropSetter(value = "prop5", required = true)
    @RequiredProp("prop5")
    public Builder<T> prop5(Section.Builder<?> prop5Builder) {
      this.mFullGroupSection.prop5 = prop5Builder == null ? null : prop5Builder.build();
      mRequired.set(3);
      return this;
    }

    public Builder<T> testEventHandler(@Nullable EventHandler<TestEvent> testEventHandler) {
      this.mFullGroupSection.testEventHandler = testEventHandler;
      return this;
    }

    @Override
    public Builder<T> key(String key) {
      return super.key(key);
    }

    @Override
    public Builder<T> loadingEventHandler(EventHandler<LoadingEvent> loadingEventHandler) {
      return super.loadingEventHandler(loadingEventHandler);
    }

    @Override
    public Builder<T> getThis() {
      return this;
    }

    @Override
    public FullGroupSection build() {
      checkArgs(REQUIRED_PROPS_COUNT, mRequired, REQUIRED_PROPS_NAMES);
      return mFullGroupSection;
    }
  }

  @Generated
  private static class CachedInputs {
    private final String globalKey;

    private final int prop1;

    CachedInputs(String globalKey, int prop1) {
      this.globalKey = globalKey;
      this.prop1 = prop1;
    }

    @Override
    public int hashCode() {
      return CommonUtils.hash(globalKey, prop1, getClass());
    }

    @Override
    public boolean equals(Object other) {
      if (this == other) {
        return true;
      }
      if (other == null || !(other instanceof CachedInputs)) {
        return false;
      }
      CachedInputs cachedValueInputs = (CachedInputs) other;
      if (!com.facebook.litho.CommonUtils.equals(globalKey, cachedValueInputs.globalKey)) {
        return false;
      }
      if (prop1 != cachedValueInputs.prop1) {
        return false;
      }
      return true;
    }
  }
}
