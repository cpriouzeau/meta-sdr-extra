SUMMARY = "rtl_433"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI = "git://github.com/merbanan/rtl_433.git;protocol=https"
SRCREV = "abb2a4dd2687f3734414a1fc2270a395a06a02b4"

S = "${WORKDIR}/git"

DEPENDS += " rtl-sdr libusb1" 
inherit cmake pkgconfig
FILES_${PN} += "${prefix}${sysconfdir}/rtl_433"

