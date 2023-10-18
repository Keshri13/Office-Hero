package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
*/
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AndroidLibraryAccessors laccForAndroidLibraryAccessors = new AndroidLibraryAccessors(owner);
    private final AndroidxLibraryAccessors laccForAndroidxLibraryAccessors = new AndroidxLibraryAccessors(owner);
    private final ApacheLibraryAccessors laccForApacheLibraryAccessors = new ApacheLibraryAccessors(owner);
    private final BumptechLibraryAccessors laccForBumptechLibraryAccessors = new BumptechLibraryAccessors(owner);
    private final GoogleLibraryAccessors laccForGoogleLibraryAccessors = new GoogleLibraryAccessors(owner);
    private final HiltLibraryAccessors laccForHiltLibraryAccessors = new HiltLibraryAccessors(owner);
    private final IntuitLibraryAccessors laccForIntuitLibraryAccessors = new IntuitLibraryAccessors(owner);
    private final JourneyLibraryAccessors laccForJourneyLibraryAccessors = new JourneyLibraryAccessors(owner);
    private final KotlinxLibraryAccessors laccForKotlinxLibraryAccessors = new KotlinxLibraryAccessors(owner);
    private final LoggingLibraryAccessors laccForLoggingLibraryAccessors = new LoggingLibraryAccessors(owner);
    private final MockitoLibraryAccessors laccForMockitoLibraryAccessors = new MockitoLibraryAccessors(owner);
    private final Okhttp3LibraryAccessors laccForOkhttp3LibraryAccessors = new Okhttp3LibraryAccessors(owner);
    private final PicassoLibraryAccessors laccForPicassoLibraryAccessors = new PicassoLibraryAccessors(owner);
    private final Retrofit2LibraryAccessors laccForRetrofit2LibraryAccessors = new Retrofit2LibraryAccessors(owner);
    private final RoboLibraryAccessors laccForRoboLibraryAccessors = new RoboLibraryAccessors(owner);
    private final Sparrow007LibraryAccessors laccForSparrow007LibraryAccessors = new Sparrow007LibraryAccessors(owner);
    private final StripeLibraryAccessors laccForStripeLibraryAccessors = new StripeLibraryAccessors(owner);
    private final ThermalLibraryAccessors laccForThermalLibraryAccessors = new ThermalLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(providers, config);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers) {
        super(config, providers);
    }

    /**
     * Returns the group of libraries at android
     */
    public AndroidLibraryAccessors getAndroid() { return laccForAndroidLibraryAccessors; }

    /**
     * Returns the group of libraries at androidx
     */
    public AndroidxLibraryAccessors getAndroidx() { return laccForAndroidxLibraryAccessors; }

    /**
     * Returns the group of libraries at apache
     */
    public ApacheLibraryAccessors getApache() { return laccForApacheLibraryAccessors; }

    /**
     * Returns the group of libraries at bumptech
     */
    public BumptechLibraryAccessors getBumptech() { return laccForBumptechLibraryAccessors; }

    /**
     * Returns the group of libraries at google
     */
    public GoogleLibraryAccessors getGoogle() { return laccForGoogleLibraryAccessors; }

    /**
     * Returns the group of libraries at hilt
     */
    public HiltLibraryAccessors getHilt() { return laccForHiltLibraryAccessors; }

    /**
     * Returns the group of libraries at intuit
     */
    public IntuitLibraryAccessors getIntuit() { return laccForIntuitLibraryAccessors; }

    /**
     * Returns the group of libraries at journey
     */
    public JourneyLibraryAccessors getJourney() { return laccForJourneyLibraryAccessors; }

    /**
     * Returns the group of libraries at kotlinx
     */
    public KotlinxLibraryAccessors getKotlinx() { return laccForKotlinxLibraryAccessors; }

    /**
     * Returns the group of libraries at logging
     */
    public LoggingLibraryAccessors getLogging() { return laccForLoggingLibraryAccessors; }

    /**
     * Returns the group of libraries at mockito
     */
    public MockitoLibraryAccessors getMockito() { return laccForMockitoLibraryAccessors; }

    /**
     * Returns the group of libraries at okhttp3
     */
    public Okhttp3LibraryAccessors getOkhttp3() { return laccForOkhttp3LibraryAccessors; }

    /**
     * Returns the group of libraries at picasso
     */
    public PicassoLibraryAccessors getPicasso() { return laccForPicassoLibraryAccessors; }

    /**
     * Returns the group of libraries at retrofit2
     */
    public Retrofit2LibraryAccessors getRetrofit2() { return laccForRetrofit2LibraryAccessors; }

    /**
     * Returns the group of libraries at robo
     */
    public RoboLibraryAccessors getRobo() { return laccForRoboLibraryAccessors; }

    /**
     * Returns the group of libraries at sparrow007
     */
    public Sparrow007LibraryAccessors getSparrow007() { return laccForSparrow007LibraryAccessors; }

    /**
     * Returns the group of libraries at stripe
     */
    public StripeLibraryAccessors getStripe() { return laccForStripeLibraryAccessors; }

    /**
     * Returns the group of libraries at thermal
     */
    public ThermalLibraryAccessors getThermal() { return laccForThermalLibraryAccessors; }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() { return vaccForVersionAccessors; }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() { return baccForBundleAccessors; }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() { return paccForPluginAccessors; }

    public static class AndroidLibraryAccessors extends SubDependencyFactory {
        private final AndroidArchLibraryAccessors laccForAndroidArchLibraryAccessors = new AndroidArchLibraryAccessors(owner);
        private final AndroidCoreLibraryAccessors laccForAndroidCoreLibraryAccessors = new AndroidCoreLibraryAccessors(owner);
        private final AndroidHiltLibraryAccessors laccForAndroidHiltLibraryAccessors = new AndroidHiltLibraryAccessors(owner);
        private final AndroidImageLibraryAccessors laccForAndroidImageLibraryAccessors = new AndroidImageLibraryAccessors(owner);

        public AndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for material (com.google.android.material:material)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterial() { return create("android.material"); }

        /**
         * Returns the group of libraries at android.arch
         */
        public AndroidArchLibraryAccessors getArch() { return laccForAndroidArchLibraryAccessors; }

        /**
         * Returns the group of libraries at android.core
         */
        public AndroidCoreLibraryAccessors getCore() { return laccForAndroidCoreLibraryAccessors; }

        /**
         * Returns the group of libraries at android.hilt
         */
        public AndroidHiltLibraryAccessors getHilt() { return laccForAndroidHiltLibraryAccessors; }

        /**
         * Returns the group of libraries at android.image
         */
        public AndroidImageLibraryAccessors getImage() { return laccForAndroidImageLibraryAccessors; }

    }

    public static class AndroidArchLibraryAccessors extends SubDependencyFactory {
        private final AndroidArchLifecycleLibraryAccessors laccForAndroidArchLifecycleLibraryAccessors = new AndroidArchLifecycleLibraryAccessors(owner);

        public AndroidArchLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at android.arch.lifecycle
         */
        public AndroidArchLifecycleLibraryAccessors getLifecycle() { return laccForAndroidArchLifecycleLibraryAccessors; }

    }

    public static class AndroidArchLifecycleLibraryAccessors extends SubDependencyFactory {

        public AndroidArchLifecycleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compiler (android.arch.lifecycle:compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() { return create("android.arch.lifecycle.compiler"); }

            /**
             * Creates a dependency provider for extensions (android.arch.lifecycle:extensions)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getExtensions() { return create("android.arch.lifecycle.extensions"); }

    }

    public static class AndroidCoreLibraryAccessors extends SubDependencyFactory {

        public AndroidCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for testing (android.arch.core:core-testing)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTesting() { return create("android.core.testing"); }

    }

    public static class AndroidHiltLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public AndroidHiltLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for hilt (com.google.dagger:hilt-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("android.hilt"); }

            /**
             * Creates a dependency provider for compiler (com.google.dagger:hilt-compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() { return create("android.hilt.compiler"); }

    }

    public static class AndroidImageLibraryAccessors extends SubDependencyFactory {

        public AndroidImageLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for slider (com.github.smarteist:Android-Image-Slider)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSlider() { return create("android.image.slider"); }

    }

    public static class AndroidxLibraryAccessors extends SubDependencyFactory {
        private final AndroidxCoreLibraryAccessors laccForAndroidxCoreLibraryAccessors = new AndroidxCoreLibraryAccessors(owner);
        private final AndroidxEspressoLibraryAccessors laccForAndroidxEspressoLibraryAccessors = new AndroidxEspressoLibraryAccessors(owner);
        private final AndroidxJunitLibraryAccessors laccForAndroidxJunitLibraryAccessors = new AndroidxJunitLibraryAccessors(owner);
        private final AndroidxLifecycleLibraryAccessors laccForAndroidxLifecycleLibraryAccessors = new AndroidxLifecycleLibraryAccessors(owner);
        private final AndroidxRoomLibraryAccessors laccForAndroidxRoomLibraryAccessors = new AndroidxRoomLibraryAccessors(owner);
        private final AndroidxTestLibraryAccessors laccForAndroidxTestLibraryAccessors = new AndroidxTestLibraryAccessors(owner);

        public AndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for activity (androidx.activity:activity-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getActivity() { return create("androidx.activity"); }

            /**
             * Creates a dependency provider for appcompat (androidx.appcompat:appcompat)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAppcompat() { return create("androidx.appcompat"); }

            /**
             * Creates a dependency provider for constraintlayout (androidx.constraintlayout:constraintlayout)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getConstraintlayout() { return create("androidx.constraintlayout"); }

            /**
             * Creates a dependency provider for junitt (junit:junit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunitt() { return create("androidx.junitt"); }

        /**
         * Returns the group of libraries at androidx.core
         */
        public AndroidxCoreLibraryAccessors getCore() { return laccForAndroidxCoreLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.espresso
         */
        public AndroidxEspressoLibraryAccessors getEspresso() { return laccForAndroidxEspressoLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.junit
         */
        public AndroidxJunitLibraryAccessors getJunit() { return laccForAndroidxJunitLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.lifecycle
         */
        public AndroidxLifecycleLibraryAccessors getLifecycle() { return laccForAndroidxLifecycleLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.room
         */
        public AndroidxRoomLibraryAccessors getRoom() { return laccForAndroidxRoomLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.test
         */
        public AndroidxTestLibraryAccessors getTest() { return laccForAndroidxTestLibraryAccessors; }

    }

    public static class AndroidxCoreLibraryAccessors extends SubDependencyFactory {

        public AndroidxCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.core:core-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx.core.ktx"); }

            /**
             * Creates a dependency provider for testing (androidx.arch.core:core-testing)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTesting() { return create("androidx.core.testing"); }

    }

    public static class AndroidxEspressoLibraryAccessors extends SubDependencyFactory {

        public AndroidxEspressoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for contrib (androidx.test.espresso:espresso-contrib)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getContrib() { return create("androidx.espresso.contrib"); }

            /**
             * Creates a dependency provider for core (androidx.test.espresso:espresso-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("androidx.espresso.core"); }

            /**
             * Creates a dependency provider for intents (androidx.test.espresso:espresso-intents)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getIntents() { return create("androidx.espresso.intents"); }

    }

    public static class AndroidxJunitLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public AndroidxJunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for junit (androidx.test.ext:junit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.junit"); }

            /**
             * Creates a dependency provider for ktx (androidx.test.ext:junit-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx.junit.ktx"); }

    }

    public static class AndroidxLifecycleLibraryAccessors extends SubDependencyFactory {

        public AndroidxLifecycleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for livedata (androidx.lifecycle:lifecycle-livedata-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLivedata() { return create("androidx.lifecycle.livedata"); }

            /**
             * Creates a dependency provider for runtime (androidx.lifecycle:lifecycle-runtime-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() { return create("androidx.lifecycle.runtime"); }

    }

    public static class AndroidxRoomLibraryAccessors extends SubDependencyFactory {

        public AndroidxRoomLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compiler (androidx.room:room-compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() { return create("androidx.room.compiler"); }

            /**
             * Creates a dependency provider for ktx (androidx.room:room-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx.room.ktx"); }

            /**
             * Creates a dependency provider for runtime (androidx.room:room-runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() { return create("androidx.room.runtime"); }

    }

    public static class AndroidxTestLibraryAccessors extends SubDependencyFactory {

        public AndroidxTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (androidx.test:core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("androidx.test.core"); }

    }

    public static class ApacheLibraryAccessors extends SubDependencyFactory {

        public ApacheLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for commonstext (org.apache.commons:commons-text)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCommonstext() { return create("apache.commonstext"); }

    }

    public static class BumptechLibraryAccessors extends SubDependencyFactory {

        public BumptechLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for glide (com.github.bumptech.glide:glide)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGlide() { return create("bumptech.glide"); }

    }

    public static class GoogleLibraryAccessors extends SubDependencyFactory {
        private final GoogleAndroidLibraryAccessors laccForGoogleAndroidLibraryAccessors = new GoogleAndroidLibraryAccessors(owner);
        private final GoogleZxingLibraryAccessors laccForGoogleZxingLibraryAccessors = new GoogleZxingLibraryAccessors(owner);

        public GoogleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at google.android
         */
        public GoogleAndroidLibraryAccessors getAndroid() { return laccForGoogleAndroidLibraryAccessors; }

        /**
         * Returns the group of libraries at google.zxing
         */
        public GoogleZxingLibraryAccessors getZxing() { return laccForGoogleZxingLibraryAccessors; }

    }

    public static class GoogleAndroidLibraryAccessors extends SubDependencyFactory {

        public GoogleAndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for gms (com.google.android.gms:play-services-basement)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGms() { return create("google.android.gms"); }

    }

    public static class GoogleZxingLibraryAccessors extends SubDependencyFactory {

        public GoogleZxingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (com.google.zxing:core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("google.zxing.core"); }

    }

    public static class HiltLibraryAccessors extends SubDependencyFactory {
        private final HiltAndroidLibraryAccessors laccForHiltAndroidLibraryAccessors = new HiltAndroidLibraryAccessors(owner);

        public HiltLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at hilt.android
         */
        public HiltAndroidLibraryAccessors getAndroid() { return laccForHiltAndroidLibraryAccessors; }

    }

    public static class HiltAndroidLibraryAccessors extends SubDependencyFactory {

        public HiltAndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for testing (com.google.dagger:hilt-android-testing)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTesting() { return create("hilt.android.testing"); }

    }

    public static class IntuitLibraryAccessors extends SubDependencyFactory {

        public IntuitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for sdp (com.intuit.sdp:sdp-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSdp() { return create("intuit.sdp"); }

            /**
             * Creates a dependency provider for ssp (com.intuit.ssp:ssp-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSsp() { return create("intuit.ssp"); }

    }

    public static class JourneyLibraryAccessors extends SubDependencyFactory {

        public JourneyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for apps (com.journeyapps:zxing-android-embedded)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getApps() { return create("journey.apps"); }

    }

    public static class KotlinxLibraryAccessors extends SubDependencyFactory {
        private final KotlinxCoroutinesLibraryAccessors laccForKotlinxCoroutinesLibraryAccessors = new KotlinxCoroutinesLibraryAccessors(owner);

        public KotlinxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at kotlinx.coroutines
         */
        public KotlinxCoroutinesLibraryAccessors getCoroutines() { return laccForKotlinxCoroutinesLibraryAccessors; }

    }

    public static class KotlinxCoroutinesLibraryAccessors extends SubDependencyFactory {

        public KotlinxCoroutinesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for test (org.jetbrains.kotlinx:kotlinx-coroutines-test)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTest() { return create("kotlinx.coroutines.test"); }

    }

    public static class LoggingLibraryAccessors extends SubDependencyFactory {

        public LoggingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for interceptor (com.squareup.okhttp3:logging-interceptor)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getInterceptor() { return create("logging.interceptor"); }

    }

    public static class MockitoLibraryAccessors extends SubDependencyFactory {

        public MockitoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.mockito:mockito-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("mockito.core"); }

            /**
             * Creates a dependency provider for inline (org.mockito:mockito-inline)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getInline() { return create("mockito.inline"); }

            /**
             * Creates a dependency provider for kotlin (com.nhaarman.mockitokotlin2:mockito-kotlin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKotlin() { return create("mockito.kotlin"); }

    }

    public static class Okhttp3LibraryAccessors extends SubDependencyFactory {

        public Okhttp3LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for mockwebserver (com.squareup.okhttp3:mockwebserver)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMockwebserver() { return create("okhttp3.mockwebserver"); }

    }

    public static class PicassoLibraryAccessors extends SubDependencyFactory {

        public PicassoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for image (com.squareup.picasso:picasso)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getImage() { return create("picasso.image"); }

    }

    public static class Retrofit2LibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final Retrofit2ConverterLibraryAccessors laccForRetrofit2ConverterLibraryAccessors = new Retrofit2ConverterLibraryAccessors(owner);

        public Retrofit2LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for retrofit2 (com.squareup.retrofit2:retrofit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("retrofit2"); }

        /**
         * Returns the group of libraries at retrofit2.converter
         */
        public Retrofit2ConverterLibraryAccessors getConverter() { return laccForRetrofit2ConverterLibraryAccessors; }

    }

    public static class Retrofit2ConverterLibraryAccessors extends SubDependencyFactory {

        public Retrofit2ConverterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for gson (com.squareup.retrofit2:converter-gson)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGson() { return create("retrofit2.converter.gson"); }

    }

    public static class RoboLibraryAccessors extends SubDependencyFactory {

        public RoboLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for electric (org.robolectric:robolectric)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getElectric() { return create("robo.electric"); }

    }

    public static class Sparrow007LibraryAccessors extends SubDependencyFactory {

        public Sparrow007LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for carouselrecyclerview (com.github.sparrow007:carouselrecyclerview)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCarouselrecyclerview() { return create("sparrow007.carouselrecyclerview"); }

    }

    public static class StripeLibraryAccessors extends SubDependencyFactory {

        public StripeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for stripeterminal (com.stripe:stripeterminal)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getStripeterminal() { return create("stripe.stripeterminal"); }

    }

    public static class ThermalLibraryAccessors extends SubDependencyFactory {

        public ThermalLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for printer (com.github.DantSu:ESCPOS-ThermalPrinter-Android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPrinter() { return create("thermal.printer"); }

    }

    public static class VersionAccessors extends VersionFactory  {

        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: androidGradlePlugin (8.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidGradlePlugin() { return getVersion("androidGradlePlugin"); }

            /**
             * Returns the version associated to this alias: androidarchlifecycle (1.1.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidarchlifecycle() { return getVersion("androidarchlifecycle"); }

            /**
             * Returns the version associated to this alias: androidcoretest (1.5.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidcoretest() { return getVersion("androidcoretest"); }

            /**
             * Returns the version associated to this alias: androidmaterial (1.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidmaterial() { return getVersion("androidmaterial"); }

            /**
             * Returns the version associated to this alias: androidxactivity (1.7.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidxactivity() { return getVersion("androidxactivity"); }

            /**
             * Returns the version associated to this alias: androidxconstraintlayout (2.1.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidxconstraintlayout() { return getVersion("androidxconstraintlayout"); }

            /**
             * Returns the version associated to this alias: androidxcore (1.10.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidxcore() { return getVersion("androidxcore"); }

            /**
             * Returns the version associated to this alias: androidxjunit (1.1.5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidxjunit() { return getVersion("androidxjunit"); }

            /**
             * Returns the version associated to this alias: androidxlifecycle (2.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidxlifecycle() { return getVersion("androidxlifecycle"); }

            /**
             * Returns the version associated to this alias: androidxrunner (1.5.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroidxrunner() { return getVersion("androidxrunner"); }

            /**
             * Returns the version associated to this alias: apachecommonstext (1.9)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getApachecommonstext() { return getVersion("apachecommonstext"); }

            /**
             * Returns the version associated to this alias: appcompat (1.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAppcompat() { return getVersion("appcompat"); }

            /**
             * Returns the version associated to this alias: archcore (2.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getArchcore() { return getVersion("archcore"); }

            /**
             * Returns the version associated to this alias: carouselrecyclerview (1.2.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCarouselrecyclerview() { return getVersion("carouselrecyclerview"); }

            /**
             * Returns the version associated to this alias: escposthermalprinter (3.3.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getEscposthermalprinter() { return getVersion("escposthermalprinter"); }

            /**
             * Returns the version associated to this alias: espresso (3.5.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getEspresso() { return getVersion("espresso"); }

            /**
             * Returns the version associated to this alias: glide (4.15.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGlide() { return getVersion("glide"); }

            /**
             * Returns the version associated to this alias: googleandroidgms (18.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGoogleandroidgms() { return getVersion("googleandroidgms"); }

            /**
             * Returns the version associated to this alias: hilt (2.44)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getHilt() { return getVersion("hilt"); }

            /**
             * Returns the version associated to this alias: imageSlider (1.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getImageSlider() { return getVersion("imageSlider"); }

            /**
             * Returns the version associated to this alias: jetbrainskotlinx (1.6.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJetbrainskotlinx() { return getVersion("jetbrainskotlinx"); }

            /**
             * Returns the version associated to this alias: junit (4.13.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJunit() { return getVersion("junit"); }

            /**
             * Returns the version associated to this alias: kotlin (1.8.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlin() { return getVersion("kotlin"); }

            /**
             * Returns the version associated to this alias: kotlinKSPVersion (1.8.10-1.0.9)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlinKSPVersion() { return getVersion("kotlinKSPVersion"); }

            /**
             * Returns the version associated to this alias: mockito (4.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMockito() { return getVersion("mockito"); }

            /**
             * Returns the version associated to this alias: mockitokotlin (2.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMockitokotlin() { return getVersion("mockitokotlin"); }

            /**
             * Returns the version associated to this alias: okhttp3 (4.10.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getOkhttp3() { return getVersion("okhttp3"); }

            /**
             * Returns the version associated to this alias: okhttpLoggingInterceptor (5.0.0-alpha.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getOkhttpLoggingInterceptor() { return getVersion("okhttpLoggingInterceptor"); }

            /**
             * Returns the version associated to this alias: picasso (2.8)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPicasso() { return getVersion("picasso"); }

            /**
             * Returns the version associated to this alias: retrofit2 (2.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRetrofit2() { return getVersion("retrofit2"); }

            /**
             * Returns the version associated to this alias: robolectric (4.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRobolectric() { return getVersion("robolectric"); }

            /**
             * Returns the version associated to this alias: roomVersion (2.5.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRoomVersion() { return getVersion("roomVersion"); }

            /**
             * Returns the version associated to this alias: sdpandroid (1.0.6)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSdpandroid() { return getVersion("sdpandroid"); }

            /**
             * Returns the version associated to this alias: stripeterminal (2.19.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getStripeterminal() { return getVersion("stripeterminal"); }

            /**
             * Returns the version associated to this alias: zxingandroidembedded (4.3.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getZxingandroidembedded() { return getVersion("zxingandroidembedded"); }

            /**
             * Returns the version associated to this alias: zxingcore (3.4.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getZxingcore() { return getVersion("zxingcore"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

    public static class PluginAccessors extends PluginFactory {
        private final AndroidPluginAccessors baccForAndroidPluginAccessors = new AndroidPluginAccessors(providers, config);
        private final KotlinPluginAccessors baccForKotlinPluginAccessors = new KotlinPluginAccessors(providers, config);

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for hilt to the plugin id 'com.google.dagger.hilt.android'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getHilt() { return createPlugin("hilt"); }

            /**
             * Creates a plugin provider for kapt to the plugin id 'org.jetbrains.kotlin.kapt'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKapt() { return createPlugin("kapt"); }

        /**
         * Returns the group of bundles at plugins.android
         */
        public AndroidPluginAccessors getAndroid() { return baccForAndroidPluginAccessors; }

        /**
         * Returns the group of bundles at plugins.kotlin
         */
        public KotlinPluginAccessors getKotlin() { return baccForKotlinPluginAccessors; }

    }

    public static class AndroidPluginAccessors extends PluginFactory {

        public AndroidPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for android.application to the plugin id 'com.android.application'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getApplication() { return createPlugin("android.application"); }

            /**
             * Creates a plugin provider for android.library to the plugin id 'com.android.library'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getLibrary() { return createPlugin("android.library"); }

    }

    public static class KotlinPluginAccessors extends PluginFactory {

        public KotlinPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for kotlin.android to the plugin id 'org.jetbrains.kotlin.android'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getAndroid() { return createPlugin("kotlin.android"); }

    }

}
