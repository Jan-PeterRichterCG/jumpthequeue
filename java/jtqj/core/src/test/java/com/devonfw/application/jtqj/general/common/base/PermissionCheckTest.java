package com.devonfw.application.jtqj.general.common.base;

import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.devonfw.module.test.common.base.ModuleTest;

/**
 * Tests the permission check in logic layer.
 */
public class PermissionCheckTest extends ModuleTest {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(PermissionCheckTest.class);

  /**
   * Check if all relevant methods in use case implementations have permission checks i.e. {@link RolesAllowed},
   * {@link DenyAll} or {@link PermitAll} annotation is applied. This is only checked for methods that are declared in
   * the corresponding interface and thus have the {@link Override} annotations applied.
   */
  @Test
  public void permissionCheckAnnotationPresent() {

    LOG.warn("TODO jrichter: reactivate permissionCheckAnnotationPresent() when security is activated in the project");
    assertThat(true);

    // TODO jrichter: reactivate permissionCheckAnnotationPresent() when security is activated in the project
    /**
     * String packageName = "com.devonfw.application.jtqj"; Filter<String> filter = new Filter<String>() {
     *
     * @Override public boolean accept(String value) {
     *
     *           return value.contains(".logic.impl.usecase.Uc") && value.endsWith("Impl"); }
     *
     *           }; ReflectionUtil ru = ReflectionUtilImpl.getInstance(); Set<String> classNames =
     *           ru.findClassNames(packageName, true, filter); Set<Class<?>> classes = ru.loadClasses(classNames);
     *           SoftAssertions assertions = new SoftAssertions(); for (Class<?> clazz : classes) { Method[] methods =
     *           clazz.getDeclaredMethods(); for (Method method : methods) { Method parentMethod =
     *           ru.getParentMethod(method); if (parentMethod != null) { Class<?> declaringClass =
     *           parentMethod.getDeclaringClass(); if (declaringClass.isInterface() &&
     *           declaringClass.getSimpleName().startsWith("Uc")) { boolean hasAnnotation = false; if
     *           (method.getAnnotation(RolesAllowed.class) != null || method.getAnnotation(DenyAll.class) != null ||
     *           method.getAnnotation(PermitAll.class) != null) { hasAnnotation = true; }
     *           assertions.assertThat(hasAnnotation) .as("Method " + method.getName() + " in Class " +
     *           clazz.getSimpleName() + " is missing access control") .isTrue(); } } } } assertions.assertAll();
     **/
  }
}
