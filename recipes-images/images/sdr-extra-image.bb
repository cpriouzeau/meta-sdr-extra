SUMMARY = "A console-only image with a sdr tools"

IMAGE_FEATURES += "splash ssh-server-openssh \
                   debug-tweaks \
                  "

EXTRA_IMAGE_FEATURES += "package-management"

LICENSE = "MIT"

CORE_IMAGE_EXTRA_INSTALL = "\
    gnuradio \
    rtl-sdr \
    rtl_433 \
    libmbe1 itpp dsd \
    "

inherit core-image image-buildinfo
