[Disguised sequences](https://www.codewars.com/kata/56fe17fcc25bf3e19a000292/train/kotlin)

*in progress*

### Errors

    Test Results:
    disguised.Disguised2Test
    test
    Log
    Fixed tests v1 *********************
    v1(1, 12)
    v1(3, 69)
    v1(3, 58)
    v1(4, 57)
    v1(5, 65)
    v1(5, 66)
    v1(7, 13)
    v1(9, 12)
    v1(10, 20)
    v1(10, 58)
    v1(10, 59)
    v1(12, 70)
    v1(16, 68)
    v1(19, 51)
    v1(20, 20)
    Test Failed
    expected:<820> but was:<-4384069900>
    Completed in 141ms
    test1
    Log
    Random Tests uEff u1 vEff v1 *********************
    uEff(715, 1640)
    u1(715, 1640)
    Test Errored
    / by zero
    Stack Trace
    disguised.SolutionKt.binomial(solution.kt:58)
    disguised.SolutionKt$u1$1.invoke(solution.kt:11)
    disguised.SolutionKt$u1$1.invoke(solution.kt)
    kotlin.sequences.TransformingSequence$iterator$1.next(Sequences.kt:148)
    disguised.SolutionKt.u1(solution.kt:60)
    disguised.Disguised2Test.test1(fixture.kt:60)
    sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
    sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
    sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
    java.lang.reflect.Method.invoke(Method.java:498)
    org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
    org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
    org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
    org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
    org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325)
    org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78)
    org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57)
    org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
    org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
    org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
    org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
    org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
    org.junit.runners.ParentRunner.run(ParentRunner.java:363)
    org.gradle.api.internal.tasks.testing.junit.JUnitTestClassExecuter.runTestClass(JUnitTestClassExecuter.java:114)
    org.gradle.api.internal.tasks.testing.junit.JUnitTestClassExecuter.execute(JUnitTestClassExecuter.java:57)
    org.gradle.api.internal.tasks.testing.junit.JUnitTestClassProcessor.processTestClass(JUnitTestClassProcessor.java:66)
    org.gradle.api.internal.tasks.testing.SuiteTestClassProcessor.processTestClass(SuiteTestClassProcessor.java:51)
    sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
    sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
    sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
    java.lang.reflect.Method.invoke(Method.java:498)
    org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:35)
    org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:24)
    org.gradle.internal.dispatch.ContextClassLoaderDispatch.dispatch(ContextClassLoaderDispatch.java:32)
    org.gradle.internal.dispatch.ProxyDispatchAdapter$DispatchingInvocationHandler.invoke(ProxyDispatchAdapter.java:93)
    com.sun.proxy.$Proxy3.processTestClass(Unknown Source)
    org.gradle.api.internal.tasks.testing.worker.TestWorker.processTestClass(TestWorker.java:109)
    sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
    sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
    sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
    java.lang.reflect.Method.invoke(Method.java:498)
    org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:35)
    org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:24)
    org.gradle.internal.remote.internal.hub.MessageHubBackedObjectConnection$DispatchWrapper.dispatch(MessageHubBackedObjectConnection.java:146)
    org.gradle.internal.remote.internal.hub.MessageHubBackedObjectConnection$DispatchWrapper.dispatch(MessageHubBackedObjectConnection.java:128)
    org.gradle.internal.remote.internal.hub.MessageHub$Handler.run(MessageHub.java:404)
    org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:63)
    org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:46)
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
    java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    org.gradle.internal.concurrent.ThreadFactoryImpl$ManagedThreadRunnable.run(ThreadFactoryImpl.java:55)
    java.lang.Thread.run(Thread.java:748)